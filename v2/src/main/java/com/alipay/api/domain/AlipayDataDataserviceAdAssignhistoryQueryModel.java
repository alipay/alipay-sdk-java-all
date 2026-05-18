package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分配明细查询
 *
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AlipayDataDataserviceAdAssignhistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1526338695573912632L;

	/**
	 * 分配动作：
"ASSIGN"-转入
"CUT"-转出
	 */
	@ApiField("apply_type")
	private String applyType;

	/**
	 * 页码
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 数据查询结束时间，时间格式：yyyy-MM-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 每页条数，最大100，明细按日期倒序
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 钱包类型：
通用钱包-INTELLIGENT
外投钱包-XAB_BP
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 数据查询开始时间，时间格式：yyyy-MM-dd，开始时间不能大于当前日期，不能大于结束时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getApplyType() {
		return this.applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
