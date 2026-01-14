package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoAgreementInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.npromo.indirect.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-12 19:57:38
 */
public class AlipayMerchantNpromoIndirectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7824128586627394763L;

	/** 
	 * 协议描述文案
	 */
	@ApiField("pop_agreement_desc")
	private String popAgreementDesc;

	/** 
	 * 协议列表
	 */
	@ApiListField("pop_agreement_list")
	@ApiField("promo_agreement_info")
	private List<PromoAgreementInfo> popAgreementList;

	/** 
	 * 活动信息图片URL
	 */
	@ApiField("pop_body_img")
	private String popBodyImg;

	/** 
	 * 品牌联名图片URL
	 */
	@ApiField("pop_brand_img")
	private String popBrandImg;

	/** 
	 * 弹窗按钮图片URL
	 */
	@ApiField("pop_btn_img")
	private String popBtnImg;

	/** 
	 * 弹窗头部图片URL
	 */
	@ApiField("pop_header_img")
	private String popHeaderImg;

	/** 
	 * 页面跳转链接
	 */
	@ApiField("pop_url")
	private String popUrl;

	/** 
	 * 本次请求的额外信息，例如请求传入的绑定关系与支付宝不匹配
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 当前内容的业务场景编码
设备申请场景：DVC_APPLY
营销活动场景：PROMO_ACTIVITY
	 */
	@ApiField("scene")
	private String scene;

	/** 
	 * 本次请求是否展示入口
	 */
	@ApiField("show")
	private Boolean show;

	public void setPopAgreementDesc(String popAgreementDesc) {
		this.popAgreementDesc = popAgreementDesc;
	}
	public String getPopAgreementDesc( ) {
		return this.popAgreementDesc;
	}

	public void setPopAgreementList(List<PromoAgreementInfo> popAgreementList) {
		this.popAgreementList = popAgreementList;
	}
	public List<PromoAgreementInfo> getPopAgreementList( ) {
		return this.popAgreementList;
	}

	public void setPopBodyImg(String popBodyImg) {
		this.popBodyImg = popBodyImg;
	}
	public String getPopBodyImg( ) {
		return this.popBodyImg;
	}

	public void setPopBrandImg(String popBrandImg) {
		this.popBrandImg = popBrandImg;
	}
	public String getPopBrandImg( ) {
		return this.popBrandImg;
	}

	public void setPopBtnImg(String popBtnImg) {
		this.popBtnImg = popBtnImg;
	}
	public String getPopBtnImg( ) {
		return this.popBtnImg;
	}

	public void setPopHeaderImg(String popHeaderImg) {
		this.popHeaderImg = popHeaderImg;
	}
	public String getPopHeaderImg( ) {
		return this.popHeaderImg;
	}

	public void setPopUrl(String popUrl) {
		this.popUrl = popUrl;
	}
	public String getPopUrl( ) {
		return this.popUrl;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setScene(String scene) {
		this.scene = scene;
	}
	public String getScene( ) {
		return this.scene;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}
	public Boolean getShow( ) {
		return this.show;
	}

}
