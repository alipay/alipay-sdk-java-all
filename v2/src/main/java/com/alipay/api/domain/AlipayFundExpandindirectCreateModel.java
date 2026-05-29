package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金二级商户KYB代进件
 *
 * @author auto create
 * @since 1.0, 2026-05-08 17:53:05
 */
public class AlipayFundExpandindirectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8744876863659465625L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 原进件单id，当biz_type为MODIFY时，必选
	 */
	@ApiField("original_order_id")
	private String originalOrderId;

	/**
	 * 外部单号（唯一幂等号），当biz_type为MODIFY时，需要保证和原始的out_biz_no不同
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 资金记账本的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 转账场景说明，对应的业务场景要求详见<a href="https://opendocs.alipay.com/solution/0j3acx?pathHash=abf6ce36">专用金资金二级商户KYB代进件对客说明文档</a> scene_directions｜转账场景说明
	 */
	@ApiField("scene_directions")
	private String sceneDirections;

	/**
	 * 转账场景截图，用户收到转账资金的账单截图或二级商户系统操作后台截图等。其值为使用alipay.fund.expandindirect.image.upload上传图片得到的一串文件 key。多个图片/文件用 , 隔开，最多支持5个图片/文件
	 */
	@ApiField("scene_image")
	private String sceneImage;

	/**
	 * 根据对应的业务场景要求提供对应的材料，详见<a href="https://opendocs.alipay.com/solution/0j3acx?pathHash=abf6ce36">专用金资金二级商户KYB代进件对客说明文档</a>scene_qualification_image｜商户行业资质图片或协议文本
	 */
	@ApiField("scene_qualification_image")
	private String sceneQualificationImage;

	/**
	 * 二级商户信息
	 */
	@ApiField("secondary_partner_info")
	private SecondaryPartnerInfo secondaryPartnerInfo;

	/**
	 * 商户站点信息，包括网站、app、小程序。其值为Map类型的json字符串，其中WEBSITE、APP、GONGZH、QITA、XCHENGXU_ZHI和WEB为Map的key值。
根据对应的业务场景要求提供对应的信息，详见<a href="https://opendocs.alipay.com/solution/0j3acx?pathHash=abf6ce36">专用金资金二级商户KYB代进件对客说明文档</a> sites｜商户站点信息（为空代表不用传）
	 */
	@ApiField("sites")
	private String sites;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneDirections() {
		return this.sceneDirections;
	}
	public void setSceneDirections(String sceneDirections) {
		this.sceneDirections = sceneDirections;
	}

	public String getSceneImage() {
		return this.sceneImage;
	}
	public void setSceneImage(String sceneImage) {
		this.sceneImage = sceneImage;
	}

	public String getSceneQualificationImage() {
		return this.sceneQualificationImage;
	}
	public void setSceneQualificationImage(String sceneQualificationImage) {
		this.sceneQualificationImage = sceneQualificationImage;
	}

	public SecondaryPartnerInfo getSecondaryPartnerInfo() {
		return this.secondaryPartnerInfo;
	}
	public void setSecondaryPartnerInfo(SecondaryPartnerInfo secondaryPartnerInfo) {
		this.secondaryPartnerInfo = secondaryPartnerInfo;
	}

	public String getSites() {
		return this.sites;
	}
	public void setSites(String sites) {
		this.sites = sites;
	}

}
