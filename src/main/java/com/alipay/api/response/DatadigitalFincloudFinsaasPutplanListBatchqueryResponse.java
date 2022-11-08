package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelPutPlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.list.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-14 17:21:52
 */
public class DatadigitalFincloudFinsaasPutplanListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3236284373982114864L;

	/** 
	 * 列表查询结果集
	 */
	@ApiListField("list")
	@ApiField("channel_put_plan_d_t_o")
	private List<ChannelPutPlanDTO> list;

	/** 
	 * 分页查询数据总量
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<ChannelPutPlanDTO> list) {
		this.list = list;
	}
	public List<ChannelPutPlanDTO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
