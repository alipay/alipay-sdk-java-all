package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 零工卡订购保险
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:30:13
 */
public class AlipayFundFlexiblestaffingInsureOrderModel extends AlipayObject {

	private static final long serialVersionUID = 7772331465419382634L;

	/**
	 * 场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 保险渠道固定值
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业信息
	 */
	@ApiField("merchant")
	private InsureCompany merchant;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保险合作商类型
	 */
	@ApiField("partner_organization")
	private InsurePartnerOrganization partnerOrganization;

	/**
	 * 产品码，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订购产品对应的推荐流水号列表
	 */
	@ApiListField("recom_flow_no_list")
	@ApiField("string")
	private List<String> recomFlowNoList;

	/**
	 * 投保场景，打卡模式固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsureCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsureCompany merchant) {
		this.merchant = merchant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public InsurePartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsurePartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRecomFlowNoList() {
		return this.recomFlowNoList;
	}
	public void setRecomFlowNoList(List<String> recomFlowNoList) {
		this.recomFlowNoList = recomFlowNoList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
