package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据notifyId进行通知重试
 *
 * @author auto create
 * @since 1.0, 2021-08-18 17:57:00
 */
public class AlipayOpenAppNotifyRetryModel extends AlipayObject {

	private static final long serialVersionUID = 2471898897828172315L;

	/**
	 * notify_id_list+是+交易notifyId的列表
	 */
	@ApiListField("notify_id_list")
	@ApiField("string")
	private List<String> notifyIdList;

	public List<String> getNotifyIdList() {
		return this.notifyIdList;
	}
	public void setNotifyIdList(List<String> notifyIdList) {
		this.notifyIdList = notifyIdList;
	}

}
