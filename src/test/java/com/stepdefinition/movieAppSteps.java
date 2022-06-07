package com.stepdefinition;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.movieAppBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class movieAppSteps extends movieAppBase {

	@Given("I am on the Cie Movie App homepage")
	public void i_am_on_the_cie_movie_app_homepage() {

		getDriver();

		System.out.println("Launching webpage");
	}

	@When("I select a movie from the popular list")
	public void i_select_a_movie_from_the_popular_list() {

		driver.findElement(By.xpath("//*[contains(text(),'Grudge 2')]")).click();

		System.out.println("movie selected");
	}

	@When("verify it contains Movie Title")
	public void verify_it_contains_movie_title() {

		boolean present;
		try {
			driver.findElement(By.id("title"));
			present = true;

			System.out.println("element exists");

		} catch (NoSuchElementException e) {
			present = false;

			System.out.println("element doesn't exists");
		}

	}

	@When("verify it contains Tags")
	public void verify_it_contains_tags() {

		boolean present;
		try {
			driver.findElement(By.id("tags"));
			present = true;

			System.out.println("element exists");

		} catch (NoSuchElementException e) {
			present = false;

			System.out.println("element doesn't exists");
		}
	}

	@When("verify it contains Title Image")
	public void verify_it_contains_title_image() {

		boolean present;
		try {
			driver.findElement(By.id("titleImage"));
			present = true;

			System.out.println("element exists");

		} catch (NoSuchElementException e) {
			present = false;

			System.out.println("element doesn't exists");

		}

	}

	@When("verify it contains Banner Image")
	public void verify_it_contains_banner_image() {

		boolean present;
		try {
			driver.findElement(By.id("bannerImage"));
			present = true;

			System.out.println("element exists");

		} catch (NoSuchElementException e) {
			present = false;

			System.out.println("element doesn't exists");

		}

	}

	@Then("exit the page once verified")
	public void exit_the_page_once_verified() {

		System.out.println("test complete");

		driver.close();

	}

}
