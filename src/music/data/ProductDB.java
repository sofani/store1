package music.data;
import java.sql.*;
import java.util.*;

import music.business.*;

public class ProductDB
{
	public static int insert(Product product)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        //This method adds a new record to the Products table in the database
        String query = 
                "INSERT INTO Product (ProductCode, ProductDescription, ProductPrice, Photo) " + 
                "VALUES (?, ?, ?, ?) "; 
        try
        {        
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getCode());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setBytes(4, product.getImageBytes());
           
            return ps.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
	
	 public static int update(Product product)
	    {
	        ConnectionPool pool = ConnectionPool.getInstance();
	        Connection connection = pool.getConnection();
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        
	        //This method updates the record with a matching email address.
	        //It returns a value of 0 if the email address can't be found.
	        String query = "UPDATE Product SET " +
	                "ProductCode = ?, " +
	                "ProductDescription = ?, " +
	                "ProductPrice = ?, " +
	                "Photo = ?, " +
	               
	                "WHERE ProductDescription = ? ";
	        try
	        {
	            ps = connection.prepareStatement(query);
	            ps.setString(1, product.getCode());
	            ps.setString(2, product.getDescription());
	            ps.setDouble(3, product.getPrice());
	            ps.setBytes(4, product.getImageBytes());
	           

	            return ps.executeUpdate();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            return 0;
	        }
	        finally
	        {
	            DBUtil.closeResultSet(rs);
	            DBUtil.closePreparedStatement(ps);
	            pool.freeConnection(connection);
	        }
	    }
	    
	    public static boolean descriptionExists(String desc)
	    {
	        ConnectionPool pool = ConnectionPool.getInstance();
	        Connection connection = pool.getConnection();
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        
	        String query = "SELECT ProductDescription FROM Product " +
	                "WHERE ProductDescription = ?";
	        try
	        {
	            ps = connection.prepareStatement(query);
	            ps.setString(1, desc);
	            rs = ps.executeQuery();
	            return rs.next();
	        }
	        catch(SQLException e)
	        {
	            e.printStackTrace();
	            return false;
	        }
	        finally
	        {
	            DBUtil.closeResultSet(rs);
	            DBUtil.closePreparedStatement(ps);
	            pool.freeConnection(connection);
	        }
	    }
	    
    //This method returns null if a product isn't found.
    public static Product selectProduct(String productCode)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM Product " +
                "WHERE ProductCode = ?";
        try
        {
            ps = connection.prepareStatement(query);
            ps.setString(1, productCode);
            rs = ps.executeQuery();
            if (rs.next())
            {
                Product p = new Product();
                p.setCode(rs.getString("ProductCode"));
                p.setDescription(rs.getString("ProductDescription"));
                p.setPrice(rs.getDouble("ProductPrice"));
                p.setImageBytes(rs.getBytes("Photo"));
                return p;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    //This method will return 0 if productID isn't found.
    public static int selectProductID(Product product)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT ProductID FROM Product " +
                "WHERE ProductCode = ?";
        try
        {
            ps = connection.prepareStatement(query);
            ps.setString(1, product.getCode());
            rs = ps.executeQuery();
            rs.next();
            int productID = rs.getInt("ProductID");
            return productID;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
  
    //This method returns null if a product isn't found.
    public static Product selectProduct(int productID)
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM Product " +
                "WHERE ProductID = ?";
        try
        {
            ps = connection.prepareStatement(query);
            ps.setInt(1, productID);
            rs = ps.executeQuery();
            if (rs.next())
            {
                Product p = new Product();
              
                p.setCode(rs.getString("ProductCode"));
                p.setDescription(rs.getString("ProductDescription"));
                p.setPrice(rs.getDouble("ProductPrice"));
                p.setImageBytes(rs.getBytes("Photo"));
                return p;
            }
            else
            {
                return null;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    
    //This method returns null if a product isn't found.
    public static ArrayList<Product> selectProducts()
    {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM Product";
        try
        {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            ArrayList<Product> products = new ArrayList<Product>();
            while (rs.next())
            {
            	
                Product p = new Product();

                p.setCode(rs.getString("ProductCode"));
                p.setDescription(rs.getString("ProductDescription"));
                p.setPrice(rs.getDouble("ProductPrice"));
                p.setImageBytes(rs.getBytes("Photo"));
                products.add(p);
            }
            return products;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        finally
        {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }    
}