package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ScenicExtInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.qr.code.apply response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-28 10:01:48
 */
public class AlipayCommerceDataQrCodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3531883489271376935L;

	/** 
	 * 对应入参的biz_type
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 码图片url（png格式，背景透明）
	 */
	@ApiField("dynamic_img_url")
	private String dynamicImgUrl;

	/** 
	 * 码图片url（白色背景）
	 */
	@ApiField("dynamic_img_url_and_trans")
	private String dynamicImgUrlAndTrans;

	/** 
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/** 
	 * 对应入参isv_pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 对应入参的outer_biz_id
	 */
	@ApiField("outer_biz_id")
	private String outerBizId;

	/** 
	 * 对应入参的page_url
	 */
	@ApiField("page_url")
	private String pageUrl;

	/** 
	 * 二维码链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 对应入参的shop_id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDynamicImgUrl(String dynamicImgUrl) {
		this.dynamicImgUrl = dynamicImgUrl;
	}
	public String getDynamicImgUrl( ) {
		return this.dynamicImgUrl;
	}

	public void setDynamicImgUrlAndTrans(String dynamicImgUrlAndTrans) {
		this.dynamicImgUrlAndTrans = dynamicImgUrlAndTrans;
	}
	public String getDynamicImgUrlAndTrans( ) {
		return this.dynamicImgUrlAndTrans;
	}

	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}
	public List<ScenicExtInfo> getExtInfo( ) {
		return this.extInfo;
	}

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setOuterBizId(String outerBizId) {
		this.outerBizId = outerBizId;
	}
	public String getOuterBizId( ) {
		return this.outerBizId;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPageUrl( ) {
		return this.pageUrl;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
