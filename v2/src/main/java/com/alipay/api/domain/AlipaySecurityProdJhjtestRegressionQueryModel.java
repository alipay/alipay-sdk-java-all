package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回归openapi
 *
 * @author auto create
 * @since 1.0, 2023-12-06 11:14:54
 */
public class AlipaySecurityProdJhjtestRegressionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6773819244452371333L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	/**
	 * sss
	 */
	@ApiField("boolean_a")
	private Boolean booleanA;

	/**
	 * aa
	 */
	@ApiField("date_a")
	private Date dateA;

	/**
	 * 1
	 */
	@ApiField("domain_nest")
	private DomainNestOther domainNest;

	/**
	 * 1
	 */
	@ApiField("nest_pubic")
	private PubNestPub nestPubic;

	/**
	 * 213
	 */
	@ApiField("number_a")
	private Long numberA;

	/**
	 * 1
	 */
	@ApiField("only_domin")
	private RegressionInDomian onlyDomin;

	/**
	 * dsds
	 */
	@ApiField("only_pub")
	private RegressionPublic onlyPub;

	/**
	 * aaa
	 */
	@ApiField("only_public")
	private RegressionPublic onlyPublic;

	/**
	 * 123
	 */
	@ApiField("path_para")
	private String pathPara;

	/**
	 * 1231
	 */
	@ApiField("price_a")
	private String priceA;

	/**
	 * 123
	 */
	@ApiField("query_para")
	private String queryPara;

	/**
	 * 11
	 */
	@ApiField("string")
	private String string;

	/**
	 * 11
	 */
	@ApiField("string_open_id")
	private String stringOpenId;

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

	public Boolean getBooleanA() {
		return this.booleanA;
	}
	public void setBooleanA(Boolean booleanA) {
		this.booleanA = booleanA;
	}

	public Date getDateA() {
		return this.dateA;
	}
	public void setDateA(Date dateA) {
		this.dateA = dateA;
	}

	public DomainNestOther getDomainNest() {
		return this.domainNest;
	}
	public void setDomainNest(DomainNestOther domainNest) {
		this.domainNest = domainNest;
	}

	public PubNestPub getNestPubic() {
		return this.nestPubic;
	}
	public void setNestPubic(PubNestPub nestPubic) {
		this.nestPubic = nestPubic;
	}

	public Long getNumberA() {
		return this.numberA;
	}
	public void setNumberA(Long numberA) {
		this.numberA = numberA;
	}

	public RegressionInDomian getOnlyDomin() {
		return this.onlyDomin;
	}
	public void setOnlyDomin(RegressionInDomian onlyDomin) {
		this.onlyDomin = onlyDomin;
	}

	public RegressionPublic getOnlyPub() {
		return this.onlyPub;
	}
	public void setOnlyPub(RegressionPublic onlyPub) {
		this.onlyPub = onlyPub;
	}

	public RegressionPublic getOnlyPublic() {
		return this.onlyPublic;
	}
	public void setOnlyPublic(RegressionPublic onlyPublic) {
		this.onlyPublic = onlyPublic;
	}

	public String getPathPara() {
		return this.pathPara;
	}
	public void setPathPara(String pathPara) {
		this.pathPara = pathPara;
	}

	public String getPriceA() {
		return this.priceA;
	}
	public void setPriceA(String priceA) {
		this.priceA = priceA;
	}

	public String getQueryPara() {
		return this.queryPara;
	}
	public void setQueryPara(String queryPara) {
		this.queryPara = queryPara;
	}

	public String getString() {
		return this.string;
	}
	public void setString(String string) {
		this.string = string;
	}

	public String getStringOpenId() {
		return this.stringOpenId;
	}
	public void setStringOpenId(String stringOpenId) {
		this.stringOpenId = stringOpenId;
	}

}
