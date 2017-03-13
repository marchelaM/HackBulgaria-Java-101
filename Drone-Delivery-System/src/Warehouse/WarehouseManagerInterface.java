package Warehouse;

public interface WarehouseManagerInterface {


	/**
	 * checks if a product has enough quantity.
	 * @param id
	 * @param quantity
	 * @return
	 */
	public boolean isProductAvailable(int id, int quantity);
	
	/**
	 * Calculates the weight of a request.
	 * @param id
	 * @param quantity
	 * @return
	 */
	public double calcWeightUnit(int id, int quantity);
	
	public void sendProduct(int id, int quantity);

	
}
