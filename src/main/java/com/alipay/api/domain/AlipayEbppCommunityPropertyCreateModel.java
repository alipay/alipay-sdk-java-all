package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物业公司创建
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:56
 */
public class AlipayEbppCommunityPropertyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7349354282187258456L;

	/**
	 * 外部联系人
	 */
	@ApiListField("contacts")
	@ApiField("external_contact")
	private List<ExternalContact> contacts;

	/**
	 * 支付宝为ISV生成的短码, 原则上是ISV名称的拼音首字母大写+YYYYMMDD+防重位
	 */
	@ApiField("isv_short_name")
	private String isvShortName;

	/**
	 * 商标地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 公司备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 物业公司名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收款账号, 必须为支付宝商户账号
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 公司长介绍
	 */
	@ApiField("rich_text")
	private String richText;

	/**
	 * 物业公司规模
10小区            LE_10
10~100小区      BETWEEN10_100
100~500小区    BETWEEN100_500
500~1000小区  BETWEEN500_1000
1000+            GE1000
	 */
	@ApiField("scale")
	private String scale;

	/**
	 * 物业公司简称
	 */
	@ApiField("short_company_name")
	private String shortCompanyName;

	public List<ExternalContact> getContacts() {
		return this.contacts;
	}
	public void setContacts(List<ExternalContact> contacts) {
		this.contacts = contacts;
	}

	public String getIsvShortName() {
		return this.isvShortName;
	}
	public void setIsvShortName(String isvShortName) {
		this.isvShortName = isvShortName;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRichText() {
		return this.richText;
	}
	public void setRichText(String richText) {
		this.richText = richText;
	}

	public String getScale() {
		return this.scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getShortCompanyName() {
		return this.shortCompanyName;
	}
	public void setShortCompanyName(String shortCompanyName) {
		this.shortCompanyName = shortCompanyName;
	}

}
