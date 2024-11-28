package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.basicinfo.alter.subscribe response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 12:02:01
 */
public class ZhimaCreditEpBasicinfoAlterSubscribeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6455935442877559662L;

	/** 
	 * 企业基本信息列表
	 */
	@ApiListField("ep_basic_infos")
	@ApiField("ep_basic_info")
	private List<EpBasicInfo> epBasicInfos;

	/** 
	 * 监听项列表
	 */
	@ApiListField("listen_item_list")
	@ApiField("string")
	private List<String> listenItemList;

	/** 
	 * 唯一的监听订单号，后续可应用于订阅取消
	 */
	@ApiField("listen_no")
	private String listenNo;

	public void setEpBasicInfos(List<EpBasicInfo> epBasicInfos) {
		this.epBasicInfos = epBasicInfos;
	}
	public List<EpBasicInfo> getEpBasicInfos( ) {
		return this.epBasicInfos;
	}

	public void setListenItemList(List<String> listenItemList) {
		this.listenItemList = listenItemList;
	}
	public List<String> getListenItemList( ) {
		return this.listenItemList;
	}

	public void setListenNo(String listenNo) {
		this.listenNo = listenNo;
	}
	public String getListenNo( ) {
		return this.listenNo;
	}

}
