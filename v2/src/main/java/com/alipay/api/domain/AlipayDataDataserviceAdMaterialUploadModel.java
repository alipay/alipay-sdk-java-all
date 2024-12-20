package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传图片或视频物料
 *
 * @author auto create
 * @since 1.0, 2024-07-19 17:24:15
 */
public class AlipayDataDataserviceAdMaterialUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1152612983611397625L;

	/**
	 * SUBSCRIPT_COMMON-角标专用
SIX_ONE_EIGHT_TINYAPP-品牌普通链接 
PROMOTE_PAGE-留资推广页(免费留资版)
PAID_PROMOTE_PAGE-留资推广页(付费留资)
BRAND_APP_COMMON_WAKE_UP_REGIS-品牌通用唤端
BRAND_APP_DOWNLOAD-品牌APP下载 等等
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 交易ID（灯火平台生成，请联系灯火运营获取）
	 */
	@ApiField("deal_id")
	private String dealId;

	/**
	 * FEI_ZHU(5,"飞猪")
TAO_PIAO_PIAO(6,"淘票票")
ELEME(7,"饿了么")
MA_YI_BAO(8,"蚂蚁保")
JIANG_XING(9,"将行");
MI_MAN(10,"米漫"),
TAI_ZHI_PU(11,"泰之菩");
等等
	 */
	@ApiField("deal_type")
	private String dealType;

	/**
	 * 上传图片/视频物料对应的外部id，需要保证唯一
	 */
	@ApiField("material_outer_id")
	private String materialOuterId;

	/**
	 * 物料元素
	 */
	@ApiField("material_unit")
	private UploadMaterial materialUnit;

	/**
	 * 创意关联模板ID，由投放平台管理生成
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * CREATIVE-创意物料
ACTION-交互动作物料
	 */
	@ApiField("upload_type")
	private String uploadType;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getDealId() {
		return this.dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}

	public String getDealType() {
		return this.dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getMaterialOuterId() {
		return this.materialOuterId;
	}
	public void setMaterialOuterId(String materialOuterId) {
		this.materialOuterId = materialOuterId;
	}

	public UploadMaterial getMaterialUnit() {
		return this.materialUnit;
	}
	public void setMaterialUnit(UploadMaterial materialUnit) {
		this.materialUnit = materialUnit;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getUploadType() {
		return this.uploadType;
	}
	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}

}
