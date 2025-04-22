package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupervisorTaskInstanceDTO;
import com.alipay.api.domain.VisitShopDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.supervisortask.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-13 15:22:10
 */
public class AlipayCommerceYuntaskSupervisortaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8682778797872758698L;

	/** 
	 * 任务实例信息
	 */
	@ApiField("task_instance_info")
	private SupervisorTaskInstanceDTO taskInstanceInfo;

	/** 
	 * 未到访门店列表
	 */
	@ApiListField("unvisit_shop_list")
	@ApiField("visit_shop_d_t_o")
	private List<VisitShopDTO> unvisitShopList;

	/** 
	 * 已到访门店列表
	 */
	@ApiListField("visit_shop_list")
	@ApiField("visit_shop_d_t_o")
	private List<VisitShopDTO> visitShopList;

	public void setTaskInstanceInfo(SupervisorTaskInstanceDTO taskInstanceInfo) {
		this.taskInstanceInfo = taskInstanceInfo;
	}
	public SupervisorTaskInstanceDTO getTaskInstanceInfo( ) {
		return this.taskInstanceInfo;
	}

	public void setUnvisitShopList(List<VisitShopDTO> unvisitShopList) {
		this.unvisitShopList = unvisitShopList;
	}
	public List<VisitShopDTO> getUnvisitShopList( ) {
		return this.unvisitShopList;
	}

	public void setVisitShopList(List<VisitShopDTO> visitShopList) {
		this.visitShopList = visitShopList;
	}
	public List<VisitShopDTO> getVisitShopList( ) {
		return this.visitShopList;
	}

}
