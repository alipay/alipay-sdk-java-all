package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询缴费输出的出账机构输入域
 *
 * @author auto create
 * @since 1.0, 2024-06-18 20:20:49
 */
public class AlipayEbppJfexportInputfieldQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7615168276672865892L;

	/**
	 * 业务类型，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 拓展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/**
	 * 获取场景:load，加载展示，渲染初始页面时的场景，例如户号的输入规则；query，查询展示，查询成功后确认页面的场景，例如缴费金额的输入规则；all，返回包含load和query两中场景。
	 */
	@ApiField("field_scene")
	private String fieldScene;

	/**
	 * 子业务类型：ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExtendField() {
		return this.extendField;
	}
	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}

	public String getFieldScene() {
		return this.fieldScene;
	}
	public void setFieldScene(String fieldScene) {
		this.fieldScene = fieldScene;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
