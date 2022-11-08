package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放计划列表查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-27 19:42:52
 */
public class AlipayMarketingActivityIotdeliveryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4479751769947268498L;

	/**
	 * 服务商代商户创建投放必选。
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private IotDeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 从1开始计算。如要查前20条，应该传page_no=1, page_size=20。 默认值为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 参数名：单页数据行数
应用场景：分页查询
如何获取：查询时用户自行指定
使用说明：单页查询行数不宜过大
默认值为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 筛选投放计划的状态
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	public IotDeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(IotDeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

}
