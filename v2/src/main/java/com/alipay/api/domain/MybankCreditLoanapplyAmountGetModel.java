package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构提额接口
 *
 * @author auto create
 * @since 1.0, 2021-09-23 19:22:35
 */
public class MybankCreditLoanapplyAmountGetModel extends AlipayObject {

	private static final long serialVersionUID = 6246487624928471648L;

	/**
	 * 额度类型
	 */
	@ApiField("biztype")
	private String biztype;

	/**
	 * 额度失效时间
	 */
	@ApiField("enddate")
	private Date enddate;

	/**
	 * 扩展字段 json格式
	 */
	@ApiField("extinfo")
	private String extinfo;

	/**
	 * 增加额度，单位分，必须是整数值
	 */
	@ApiField("gainamount")
	private String gainamount;

	/**
	 * 请求来源
	 */
	@ApiField("operatesource")
	private String operatesource;

	/**
	 * 请求号（幂等）
	 */
	@ApiField("requestid")
	private String requestid;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * site
	 */
	@ApiField("site")
	private String site;

	/**
	 * 支付宝userid
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	/**
	 * 额度生效时间
	 */
	@ApiField("startdate")
	private Date startdate;

	/**
	 * 子额度类型
	 */
	@ApiField("subbiztype")
	private String subbiztype;

	public String getBiztype() {
		return this.biztype;
	}
	public void setBiztype(String biztype) {
		this.biztype = biztype;
	}

	public Date getEnddate() {
		return this.enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getExtinfo() {
		return this.extinfo;
	}
	public void setExtinfo(String extinfo) {
		this.extinfo = extinfo;
	}

	public String getGainamount() {
		return this.gainamount;
	}
	public void setGainamount(String gainamount) {
		this.gainamount = gainamount;
	}

	public String getOperatesource() {
		return this.operatesource;
	}
	public void setOperatesource(String operatesource) {
		this.operatesource = operatesource;
	}

	public String getRequestid() {
		return this.requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteuserid() {
		return this.siteuserid;
	}
	public void setSiteuserid(String siteuserid) {
		this.siteuserid = siteuserid;
	}

	public Date getStartdate() {
		return this.startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getSubbiztype() {
		return this.subbiztype;
	}
	public void setSubbiztype(String subbiztype) {
		this.subbiztype = subbiztype;
	}

}
