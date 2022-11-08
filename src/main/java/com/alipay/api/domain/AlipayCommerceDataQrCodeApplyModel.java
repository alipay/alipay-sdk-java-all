package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 酒店二维码发放
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:21:53
 */
public class AlipayCommerceDataQrCodeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4388962394648596854L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 扩展信息，未指定的key支付宝侧不消费
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * 服务商pid，用于发码埋参
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 业务幂等号，同一家服务商outerBizId+shopId+bizType相同，会发放相同的二维码
	 */
	@ApiField("outer_biz_id")
	private String outerBizId;

	/**
	 * 指定页面URL，需保证URL符合小程序的schemes固定格式。
schemes固定格式：alipays://platformapi/startapp?appId=【appid】&page=【具体页面】；appid是对应小程序的appid，格式检测到“&page=”，page后的具体页面链接不做限制。

URL的page内容由服务商自定义，需要识别门店的建议服务商在url带入shopid的识别，建议格式：
alipays://platformapi/startapp?appId=【appid】&page=【具体页面】&query=【shopid等传参】
	 */
	@ApiField("page_url")
	private String pageUrl;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 接入服务商的标识，接入前请提前联系支付宝技术人员分配
	 */
	@ApiField("source_code")
	private String sourceCode;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOuterBizId() {
		return this.outerBizId;
	}
	public void setOuterBizId(String outerBizId) {
		this.outerBizId = outerBizId;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

}
