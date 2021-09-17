package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NotifyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.notify.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-18 17:57:37
 */
public class AlipayOpenAppNotifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2379982791152842671L;

	/** 
	 * notify_info_list+是+用于返回用户的信息+调接口返回得到
	 */
	@ApiListField("notify_info_list")
	@ApiField("notify_info")
	private List<NotifyInfo> notifyInfoList;

	public void setNotifyInfoList(List<NotifyInfo> notifyInfoList) {
		this.notifyInfoList = notifyInfoList;
	}
	public List<NotifyInfo> getNotifyInfoList( ) {
		return this.notifyInfoList;
	}

}
