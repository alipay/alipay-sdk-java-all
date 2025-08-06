package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-27 10:12:29
 */
public class EbikeChargeQrcodeParam extends AlipayObject {

	private static final long serialVersionUID = 8179992143429828217L;

	/**
	 * 业务流水号，标识一笔生码数据，用于幂等判断，返回值中原样返回
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 标识来源系统
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 对应的二维码描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 码值拼接参数，最多5对，用来拼接到码值，内容按照格式为参数名=参数值&参数名=参数值
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 小程序启动参数，内容按照格式为参数名=参数值&参数名=参数值
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * 合成后图片的大小规格，有s、m、l三档可选，默认s，单位cm
	 */
	@ApiField("size")
	private String size;

	/**
	 * page/component/component-pages/view/view为小程序中能访问到的页面路径
	 */
	@ApiField("url_param")
	private String urlParam;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getQueryParam() {
		return this.queryParam;
	}
	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getUrlParam() {
		return this.urlParam;
	}
	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

}
