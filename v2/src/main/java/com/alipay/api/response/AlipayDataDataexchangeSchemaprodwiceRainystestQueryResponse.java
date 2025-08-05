package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.schemaprodwice.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-18 15:07:17
 */
public class AlipayDataDataexchangeSchemaprodwiceRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8736264762496822828L;

	/** 
	 * true
	 */
	@ApiField("boolean_01_n_select_one")
	private Boolean boolean01NSelectOne;

	/** 
	 * null
	 */
	@ApiListField("boolean_02_n_select_one")
	@ApiField("boolean")
	private List<Boolean> boolean02NSelectOne;

	/** 
	 * date
	 */
	@ApiField("date_01_n_select_one")
	private Date date01NSelectOne;

	/** 
	 * null
	 */
	@ApiListField("date_02_n_select_one")
	@ApiField("date")
	private List<Date> date02NSelectOne;

	/** 
	 * number
	 */
	@ApiField("num_01_n_select_one")
	private Long num01NSelectOne;

	/** 
	 * null
	 */
	@ApiListField("num_02_n_select_one")
	@ApiField("number")
	private List<Long> num02NSelectOne;

	/** 
	 * price
	 */
	@ApiField("price_01_n_select_one")
	private String price01NSelectOne;

	/** 
	 * null
	 */
	@ApiListField("price_02_n_select_one")
	@ApiField("price")
	private List<String> price02NSelectOne;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 2
	 */
	@ApiField("string_01_n_select_one")
	private String string01NSelectOne;

	/** 
	 * null
	 */
	@ApiListField("string_02_n_select_one")
	@ApiField("string")
	private List<String> string02NSelectOne;

	public void setBoolean01NSelectOne(Boolean boolean01NSelectOne) {
		this.boolean01NSelectOne = boolean01NSelectOne;
	}
	public Boolean getBoolean01NSelectOne( ) {
		return this.boolean01NSelectOne;
	}

	public void setBoolean02NSelectOne(List<Boolean> boolean02NSelectOne) {
		this.boolean02NSelectOne = boolean02NSelectOne;
	}
	public List<Boolean> getBoolean02NSelectOne( ) {
		return this.boolean02NSelectOne;
	}

	public void setDate01NSelectOne(Date date01NSelectOne) {
		this.date01NSelectOne = date01NSelectOne;
	}
	public Date getDate01NSelectOne( ) {
		return this.date01NSelectOne;
	}

	public void setDate02NSelectOne(List<Date> date02NSelectOne) {
		this.date02NSelectOne = date02NSelectOne;
	}
	public List<Date> getDate02NSelectOne( ) {
		return this.date02NSelectOne;
	}

	public void setNum01NSelectOne(Long num01NSelectOne) {
		this.num01NSelectOne = num01NSelectOne;
	}
	public Long getNum01NSelectOne( ) {
		return this.num01NSelectOne;
	}

	public void setNum02NSelectOne(List<Long> num02NSelectOne) {
		this.num02NSelectOne = num02NSelectOne;
	}
	public List<Long> getNum02NSelectOne( ) {
		return this.num02NSelectOne;
	}

	public void setPrice01NSelectOne(String price01NSelectOne) {
		this.price01NSelectOne = price01NSelectOne;
	}
	public String getPrice01NSelectOne( ) {
		return this.price01NSelectOne;
	}

	public void setPrice02NSelectOne(List<String> price02NSelectOne) {
		this.price02NSelectOne = price02NSelectOne;
	}
	public List<String> getPrice02NSelectOne( ) {
		return this.price02NSelectOne;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setString01NSelectOne(String string01NSelectOne) {
		this.string01NSelectOne = string01NSelectOne;
	}
	public String getString01NSelectOne( ) {
		return this.string01NSelectOne;
	}

	public void setString02NSelectOne(List<String> string02NSelectOne) {
		this.string02NSelectOne = string02NSelectOne;
	}
	public List<String> getString02NSelectOne( ) {
		return this.string02NSelectOne;
	}

}
