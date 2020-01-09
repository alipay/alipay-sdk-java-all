package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子凭证实例操作信息，含模板ID及其参数。
 *
 * @author auto create
 * @since 1.0, 2019-08-20 15:40:08
 */
public class AlipassInstanceOpInfo extends AlipayObject {

	private static final long serialVersionUID = 7452615983345227337L;

	/**
	 * alipass实例信息顺序，正整数，按order顺排，不可重复。
	 */
	@ApiField("order")
	private Long order;

	/**
	 * 支付宝alipass模版ID，即调用模板创建接口时返回的tpl_id。
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模版动态参数信息：对应模板中$变量名$的动态参数，见模板创建接口返回值中的tpl_params字段。
	 */
	@ApiField("tpl_params")
	private String tplParams;

	public Long getOrder() {
		return this.order;
	}
	public void setOrder(Long order) {
		this.order = order;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public String getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(String tplParams) {
		this.tplParams = tplParams;
	}

}
