package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询钉钉企业零钱账单
 *
 * @author auto create
 * @since 1.0, 2020-09-29 12:21:49
 */
public class AlipayDataDataserviceBillDingstaffbizorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1821435716338962917L;

	/**
	 * 钉钉业务单据号
	 */
	@ApiField("biz_trans_id")
	private String bizTransId;

	/**
	 * 业务类型标识。支持类型有：0100-群收款，0101-报销，0102-支付，0103-收款，0104-转账，0105-工资
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 资金流向。S表示收入，B表示支出
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 查询结束时间, 日期格式:2018-09-30 00:00:00, 开区间, 默认当前时间点
最多查一年内的数据
	 */
	@ApiField("gmt_date_end")
	private Date gmtDateEnd;

	/**
	 * 查询开始时间, 日期格式:2018-07-30 00:00:00, 闭区间
最多查一年内的数据
	 */
	@ApiField("gmt_date_start")
	private Date gmtDateStart;

	/**
	 * 上次查询最后一笔id, 翻页查询需要带上上次查询最后一笔的id
	 */
	@ApiField("last_id")
	private String lastId;

	/**
	 * 支付宝流水号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 分页大小,[0-100], 最大不超过100, 默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 标题,对收支场景描述
	 */
	@ApiField("title")
	private String title;

	/**
	 * 支付宝虚拟uid
	 */
	@ApiField("virtual_user_id")
	private String virtualUserId;

	public String getBizTransId() {
		return this.bizTransId;
	}
	public void setBizTransId(String bizTransId) {
		this.bizTransId = bizTransId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Date getGmtDateEnd() {
		return this.gmtDateEnd;
	}
	public void setGmtDateEnd(Date gmtDateEnd) {
		this.gmtDateEnd = gmtDateEnd;
	}

	public Date getGmtDateStart() {
		return this.gmtDateStart;
	}
	public void setGmtDateStart(Date gmtDateStart) {
		this.gmtDateStart = gmtDateStart;
	}

	public String getLastId() {
		return this.lastId;
	}
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getVirtualUserId() {
		return this.virtualUserId;
	}
	public void setVirtualUserId(String virtualUserId) {
		this.virtualUserId = virtualUserId;
	}

}
