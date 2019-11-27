package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 采购平台信息变更通知物料平台接口
 *
 * @author auto create
 * @since 1.0, 2018-04-08 15:21:10
 */
public class AntMerchantExpandAssetceresNotifySyncModel extends AlipayObject {

	private static final long serialVersionUID = 7248266829178743583L;

	/**
	 * 业务对应通知参数，json格式的字符串。
	 */
	@ApiField("context")
	private String context;

	/**
	 * 业务类型：商品信息变更通知，RT单审批节点状态变更通知
	 */
	@ApiField("notify_type")
	private String notifyType;

	public String getContext() {
		return this.context;
	}
	public void setContext(String context) {
		this.context = context;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

}
