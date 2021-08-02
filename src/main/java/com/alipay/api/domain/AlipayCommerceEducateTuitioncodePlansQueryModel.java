package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码已到账明细查询
 *
 * @author auto create
 * @since 1.0, 2020-12-08 19:23:54
 */
public class AlipayCommerceEducateTuitioncodePlansQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2589232319188469844L;

	/**
	 * 是否包含订单信息
	 */
	@ApiField("include_order")
	private Boolean includeOrder;

	/**
	 * 分页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 场景，固定"XFM"
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 直付通smid,间联商户必传
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 若为空则查询全量

1打款调度中

2打款完成

3退款中

4退款完成
	 */
	@ApiField("status")
	private String status;

	public Boolean getIncludeOrder() {
		return this.includeOrder;
	}
	public void setIncludeOrder(Boolean includeOrder) {
		this.includeOrder = includeOrder;
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
