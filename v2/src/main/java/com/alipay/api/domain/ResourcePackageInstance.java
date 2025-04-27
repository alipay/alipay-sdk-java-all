package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源包实例详情列表
 *
 * @author auto create
 * @since 1.0, 2023-09-19 14:26:19
 */
public class ResourcePackageInstance extends AlipayObject {

	private static final long serialVersionUID = 5118299747483235244L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 资源包规格CODE
 - public_cloudd_cd_cn_free_bag
 - public_cloudd_cd_cn_base_bag
 - public_cloudd_cd_cn_standard_bag
 - public_cloudd_cd_cn_pro_bag
 - public_cloudd_cd_cn_ent_bag
 - public_cloudd_cd_cn_flagship_bag
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 资源包规格实例ID
	 */
	@ApiField("spec_instance_id")
	private String specInstanceId;

	/**
	 * 资源包规格名称
 - 云开发免费版
 - 云开发基础版
 - 云开发标准版
 - 云开发专业版
 - 云开发企业版
 - 云开发旗舰版
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecInstanceId() {
		return this.specInstanceId;
	}
	public void setSpecInstanceId(String specInstanceId) {
		this.specInstanceId = specInstanceId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
