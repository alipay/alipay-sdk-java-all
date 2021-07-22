package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑物流申请创建，业务扩展信息详情；
在CUPBOARD（取餐柜模式 场景）；支持2种模式单元格分配规则；
分配规则1：指定设备编号+指定单元格编号
分配规则2：指定申请单元格数量，自动分配
两者都传入，优先按分配规则1处理
 *
 * @author auto create
 * @since 1.0, 2018-12-17 21:47:08
 */
public class LogisticsExternalInfo extends AlipayObject {

	private static final long serialVersionUID = 1821629436337475246L;

	/**
	 * 在CUPBOARD（取餐柜模式 场景），为指定设备编号，单元格编号；
约束定义：
支持批量传入多个单元格编号；
不支持多个设备编号
	 */
	@ApiListField("carrier_info_list")
	@ApiField("logistics_external_carrier_info")
	private List<LogisticsExternalCarrierInfo> carrierInfoList;

	/**
	 * 在CUPBOARD（取餐柜模式 场景），为指定单元格数量，系统按照默认规则分配；
	 */
	@ApiField("carrier_sub_count")
	private Long carrierSubCount;

	public List<LogisticsExternalCarrierInfo> getCarrierInfoList() {
		return this.carrierInfoList;
	}
	public void setCarrierInfoList(List<LogisticsExternalCarrierInfo> carrierInfoList) {
		this.carrierInfoList = carrierInfoList;
	}

	public Long getCarrierSubCount() {
		return this.carrierSubCount;
	}
	public void setCarrierSubCount(Long carrierSubCount) {
		this.carrierSubCount = carrierSubCount;
	}

}
