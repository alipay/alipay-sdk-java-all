package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.sharetoken.decode response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 20:38:26
 */
public class AlipayMarketingSharetokenDecodeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8216819459386186986L;

	/** 
	 * 第一个按钮名称
	 */
	@ApiField("btn_one_name")
	private String btnOneName;

	/** 
	 * 第一个按钮链接
	 */
	@ApiField("btn_one_schema")
	private String btnOneSchema;

	/** 
	 * 第二个按钮名称
	 */
	@ApiField("btn_two_name")
	private String btnTwoName;

	/** 
	 * 第二个按钮链接
	 */
	@ApiField("btn_two_schema")
	private String btnTwoSchema;

	/** 
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * icon地址
	 */
	@ApiField("icon")
	private String icon;

	/** 
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public void setBtnOneName(String btnOneName) {
		this.btnOneName = btnOneName;
	}
	public String getBtnOneName( ) {
		return this.btnOneName;
	}

	public void setBtnOneSchema(String btnOneSchema) {
		this.btnOneSchema = btnOneSchema;
	}
	public String getBtnOneSchema( ) {
		return this.btnOneSchema;
	}

	public void setBtnTwoName(String btnTwoName) {
		this.btnTwoName = btnTwoName;
	}
	public String getBtnTwoName( ) {
		return this.btnTwoName;
	}

	public void setBtnTwoSchema(String btnTwoSchema) {
		this.btnTwoSchema = btnTwoSchema;
	}
	public String getBtnTwoSchema( ) {
		return this.btnTwoSchema;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getIcon( ) {
		return this.icon;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

}
