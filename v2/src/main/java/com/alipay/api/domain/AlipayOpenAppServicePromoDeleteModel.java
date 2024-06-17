package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推广删除
 *
 * @author auto create
 * @since 1.0, 2022-04-21 14:44:19
 */
public class AlipayOpenAppServicePromoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4167287273322126368L;

	/**
	 * 操作类型。枚举值如下：
    DELETE("DELETE", "删除"), 非审核中状态中支持该操作；
    GIVE_UP_EDIT("GIVE_UP_EDIT", "放弃修改"),存在生效和编辑驳回两个版本时支持该操作;
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getPromoRecordId() {
		return this.promoRecordId;
	}
	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}

}
