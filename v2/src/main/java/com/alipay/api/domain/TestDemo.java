package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * test
 *
 * @author auto create
 * @since 1.0, 2023-12-03 22:42:24
 */
public class TestDemo extends AlipayObject {

	private static final long serialVersionUID = 1275643394218658439L;

	/**
	 * 1
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * 1
	 */
	@ApiField("a_uid")
	private String aUid;

	/**
	 * test
	 */
	@ApiListField("date_a")
	@ApiField("date")
	private List<Date> dateA;

	/**
	 * test 当前字段已废弃(test废弃字段测试)
	 */
	@ApiField("open_id")
	@Deprecated
	private String openId;

	/**
	 * test
	 */
	@ApiListField("price_a")
	@ApiField("price")
	private List<String> priceA;

	/**
	 * test
	 */
	@ApiListField("string_a")
	@ApiField("string")
	private List<String> stringA;

	/**
	 * ttes
	 */
	@ApiField("string_yingshe")
	private String stringYingshe;

	/**
	 * test
	 */
	@ApiField("string_yingshe_1_open_id")
	private String stringYingshe1OpenId;

	/**
	 * test
	 */
	@ApiField("string_yingshe_2_openid")
	private String stringYingshe2Openid;

	/**
	 * test 当前字段已废弃(test废弃字段测试)
	 */
	@ApiField("uid")
	@Deprecated
	private String uid;

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public String getaUid() {
		return this.aUid;
	}
	public void setaUid(String aUid) {
		this.aUid = aUid;
	}

	public List<Date> getDateA() {
		return this.dateA;
	}
	public void setDateA(List<Date> dateA) {
		this.dateA = dateA;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getPriceA() {
		return this.priceA;
	}
	public void setPriceA(List<String> priceA) {
		this.priceA = priceA;
	}

	public List<String> getStringA() {
		return this.stringA;
	}
	public void setStringA(List<String> stringA) {
		this.stringA = stringA;
	}

	public String getStringYingshe() {
		return this.stringYingshe;
	}
	public void setStringYingshe(String stringYingshe) {
		this.stringYingshe = stringYingshe;
	}

	public String getStringYingshe1OpenId() {
		return this.stringYingshe1OpenId;
	}
	public void setStringYingshe1OpenId(String stringYingshe1OpenId) {
		this.stringYingshe1OpenId = stringYingshe1OpenId;
	}

	public String getStringYingshe2Openid() {
		return this.stringYingshe2Openid;
	}
	public void setStringYingshe2Openid(String stringYingshe2Openid) {
		this.stringYingshe2Openid = stringYingshe2Openid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
