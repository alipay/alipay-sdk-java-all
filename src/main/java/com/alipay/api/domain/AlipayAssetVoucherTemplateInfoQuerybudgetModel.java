package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板预算查询
 *
 * @author auto create
 * @since 1.0, 2021-02-01 11:19:11
 */
public class AlipayAssetVoucherTemplateInfoQuerybudgetModel extends AlipayObject {

	private static final long serialVersionUID = 7782174646151178512L;

	/**
	 * 是否查询实时数据，true：查询实时数据，false：查询非实时数据(5分钟延迟)
	 */
	@ApiField("is_real_time_data")
	private Boolean isRealTimeData;

	/**
	 * 预算类型，取值范围只能是MONEY、AMOUNT，MONEY代表金额预算，AMOUNT代表数量预算
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 券模板ID列表，请使用json数组格式
	 */
	@ApiField("template_id_list")
	private String templateIdList;

	public Boolean getIsRealTimeData() {
		return this.isRealTimeData;
	}
	public void setIsRealTimeData(Boolean isRealTimeData) {
		this.isRealTimeData = isRealTimeData;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTemplateIdList() {
		return this.templateIdList;
	}
	public void setTemplateIdList(String templateIdList) {
		this.templateIdList = templateIdList;
	}

}
