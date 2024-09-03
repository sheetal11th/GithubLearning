package StepDefination;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class SearchSteps {
	Product product;
	Search search;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	    System.out.println("step1-I am on login page");
	}

	@When("I search for a producr with name {string} and Price {int}")
	public void i_search_for_a_producr_with_name_and_price(String productName, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 2-Search the product " + productName +"with "+ price);
	    
	    product =new Product(productName, price);
	    
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 3-the product " + productName +"is displayed");
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println(name);
		Assert.assertEquals(product.getProductName(), name);
	}


}
