package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客级联分佣任务创建
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:39
 */
public class KoubeiAdvertCommissionCascademissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3735681315514439853L;

	/**
	 * 子任务的分佣配置
	 */
	@ApiListField("cascade_mission_conf")
	@ApiField("cascade_mission_conf_model")
	private List<CascadeMissionConfModel> cascadeMissionConf;

	/**
	 * 根据identify_type指定的值
misison时，为需要设置子任务的分佣任务ID
voucher时，为需要券ID
	 */
	@ApiField("identify")
	private String identify;

	/**
	 * 主键类型
mission：已经领取的任务，需要在该任务下发布子任务的ID
voucher：任务对应的券ID
	 */
	@ApiField("identify_type")
	private String identifyType;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	public List<CascadeMissionConfModel> getCascadeMissionConf() {
		return this.cascadeMissionConf;
	}
	public void setCascadeMissionConf(List<CascadeMissionConfModel> cascadeMissionConf) {
		this.cascadeMissionConf = cascadeMissionConf;
	}

	public String getIdentify() {
		return this.identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}

	public String getIdentifyType() {
		return this.identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
