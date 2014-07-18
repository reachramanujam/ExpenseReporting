package com.practice.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("expenseTypeDAO")
public class ExpenseTypeDao 
{
	private NamedParameterJdbcTemplate jdbc;	
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public ExpenseType fetchById(int id){
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);		
		
		return jdbc.queryForObject("Select * from expensetype where id = :id", params, new RowMapper<ExpenseType>() {

			public ExpenseType mapRow(ResultSet rs, int rowNum) throws SQLException {
				ExpenseType expenseType = new ExpenseType();
				expenseType.setId(rs.getInt("id"));
				expenseType.setName(rs.getString("name"));
				expenseType.setDescription(rs.getString("description"));
				return expenseType;
			}			
		});		
	}
	

	public List<ExpenseType> fetchAll()
	{
		
		return jdbc.query("Select * from expensetype", new RowMapper<ExpenseType>() {

			public ExpenseType mapRow(ResultSet rs, int rowNum) throws SQLException {
				ExpenseType expenseType = new ExpenseType();
				expenseType.setId(rs.getInt("id"));
				expenseType.setName(rs.getString("name"));
				expenseType.setDescription(rs.getString("description"));
				return expenseType;
			}
			
		});		
	}
	
	public boolean update(ExpenseType expenseType) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(expenseType);		
		return jdbc.update("update expensetype set name=:name, description=:description where id=:id", params ) == 1;	
	}
	
	
	public boolean add(ExpenseType expenseType) {
			
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(expenseType);		
		return jdbc.update("insert into expensetype (name, description) values (:name, :description)", params ) == 1;		
	}
}
