package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询交易投诉列表
 *
 * @author auto create
 * @since 1.0, 2024-06-17 14:04:15
 */
public class AlipayMerchantTradecomplainBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5894984423794664932L;

	/**
	 * 查询开始时间
时间格式：yyyy-MM-dd HH:mm:ss
若不填写，则默认当前时间30天前。
注意：begin_time和end_time时间跨度最大一年
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 查询结束时间
时间格式：yyyy-MM-dd HH:mm:ss
若不填写，则默认当前时间。
注意：begin_time和end_time时间跨度最大一年
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当前页，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认10条，最多支持20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 状态如下
待处理：MERCHANT_PROCESSING 
已处理：MERCHANT_FEEDBACKED 
投诉完结：FINISHED 
投诉关闭：CANCELLED 
客服处理中：PLATFORM_PROCESSING 
客服处理完结：PLATFORM_FINISH 
投诉关闭：CLOSED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 应用信息
	 */
	@ApiListField("target_infos")
	@ApiField("target_info")
	private List<TargetInfo> targetInfos;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public List<TargetInfo> getTargetInfos() {
		return this.targetInfos;
	}
	public void setTargetInfos(List<TargetInfo> targetInfos) {
		this.targetInfos = targetInfos;
	}

}
