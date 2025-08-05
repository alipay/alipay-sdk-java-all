package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款人查询
 *
 * @author auto create
 * @since 1.0, 2023-05-11 14:06:42
 */
public class AlipayOverseasOpenIndrbeneficiaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5281288746898437925L;

	/**
	 * 收款方名称
	 */
	@ApiField("beneficiary_name")
	private String beneficiaryName;

	/**
	 * 场景类型:
TUITION 留学缴费
HOUSE_RENTAL 留学租房
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getBeneficiaryName() {
		return this.beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
