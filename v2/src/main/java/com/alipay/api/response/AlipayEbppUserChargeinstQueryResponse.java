package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryUserChargeInstAndAreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.user.chargeinst.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:21:40
 */
public class AlipayEbppUserChargeinstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5376326962553411427L;

	/** 
	 * 提供给邦道的接口，查询用户常缴机构与常住城市信息，该对象为输出具体内容。
	 */
	@ApiListField("data_list")
	@ApiField("query_user_charge_inst_and_area_info")
	private List<QueryUserChargeInstAndAreaInfo> dataList;

	public void setDataList(List<QueryUserChargeInstAndAreaInfo> dataList) {
		this.dataList = dataList;
	}
	public List<QueryUserChargeInstAndAreaInfo> getDataList( ) {
		return this.dataList;
	}

}
