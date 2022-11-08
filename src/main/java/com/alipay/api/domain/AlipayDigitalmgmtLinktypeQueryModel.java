package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询满足条件的环节类型列表
 *
 * @author auto create
 * @since 1.0, 2022-04-18 15:11:12
 */
public class AlipayDigitalmgmtLinktypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2357417573528975674L;

	/**
	 * 关联场景类型code
	 */
	@ApiField("scene_type_code")
	private String sceneTypeCode;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getSceneTypeCode() {
		return this.sceneTypeCode;
	}
	public void setSceneTypeCode(String sceneTypeCode) {
		this.sceneTypeCode = sceneTypeCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
