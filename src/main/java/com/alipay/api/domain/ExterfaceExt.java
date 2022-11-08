package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接口配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:42:54
 */
public class ExterfaceExt extends AlipayObject {

	private static final long serialVersionUID = 3264589617226142952L;

	/**
	 * 通知字段
	 */
	@ApiListField("notify_field_ext")
	@ApiField("notify_field_ext")
	private List<NotifyFieldExt> notifyFieldExt;

	/**
	 * 通知场景
	 */
	@ApiListField("notify_trigger_ext")
	@ApiField("notify_trigger_ext")
	private List<NotifyTriggerExt> notifyTriggerExt;

	/**
	 * 输出字段
	 */
	@ApiListField("output_ext")
	@ApiField("output_ext")
	private List<OutputExt> outputExt;

	public List<NotifyFieldExt> getNotifyFieldExt() {
		return this.notifyFieldExt;
	}
	public void setNotifyFieldExt(List<NotifyFieldExt> notifyFieldExt) {
		this.notifyFieldExt = notifyFieldExt;
	}

	public List<NotifyTriggerExt> getNotifyTriggerExt() {
		return this.notifyTriggerExt;
	}
	public void setNotifyTriggerExt(List<NotifyTriggerExt> notifyTriggerExt) {
		this.notifyTriggerExt = notifyTriggerExt;
	}

	public List<OutputExt> getOutputExt() {
		return this.outputExt;
	}
	public void setOutputExt(List<OutputExt> outputExt) {
		this.outputExt = outputExt;
	}

}
