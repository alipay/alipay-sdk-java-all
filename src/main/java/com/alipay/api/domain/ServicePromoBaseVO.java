package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务场景素材详情
 *
 * @author auto create
 * @since 1.0, 2021-07-16 19:23:37
 */
public class ServicePromoBaseVO extends AlipayObject {

	private static final long serialVersionUID = 2599653746957726746L;

	/**
	 * 状态；枚举值如下：
 CREATE_AUDITING("CREATE_AUDITING", "新增审核中"),
    EDIT_AUDITING("EDIT_AUDITING", "修改审核中"),
    AUDITED("AUDITED", "审核通过"),
    CREATE_AUDIT_REJECT("CREATE_AUDIT_REJECT", "新增驳回"),
    EDIT_AUDIT_REJECT("EDIT_AUDIT_REJECT", "修改驳回"),
    DELETED("DELETED", "已删除");
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 展台ID
	 */
	@ApiField("promo_booth_id")
	private String promoBoothId;

	/**
	 * 内容列表
	 */
	@ApiListField("promo_contents")
	@ApiField("promo_content_biz_v_o")
	private List<PromoContentBizVO> promoContents;

	/**
	 * 实体的编码列表
	 */
	@ApiListField("promo_entity_codes")
	@ApiField("string")
	private List<String> promoEntityCodes;

	/**
	 * 实体类型。枚举值如下：
MINI_APP("MINI_APP", "小程序"),
STD_SERVICE("STD_SERVICE", "标准化服务"),
SERVICE_BACK_CATALOG("SERVICE_BACK_CATALOG", "服务类目")
	 */
	@ApiField("promo_entity_type")
	private String promoEntityType;

	/**
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	/**
	 * 驳回理由
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getPromoBoothId() {
		return this.promoBoothId;
	}
	public void setPromoBoothId(String promoBoothId) {
		this.promoBoothId = promoBoothId;
	}

	public List<PromoContentBizVO> getPromoContents() {
		return this.promoContents;
	}
	public void setPromoContents(List<PromoContentBizVO> promoContents) {
		this.promoContents = promoContents;
	}

	public List<String> getPromoEntityCodes() {
		return this.promoEntityCodes;
	}
	public void setPromoEntityCodes(List<String> promoEntityCodes) {
		this.promoEntityCodes = promoEntityCodes;
	}

	public String getPromoEntityType() {
		return this.promoEntityType;
	}
	public void setPromoEntityType(String promoEntityType) {
		this.promoEntityType = promoEntityType;
	}

	public String getPromoRecordId() {
		return this.promoRecordId;
	}
	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
