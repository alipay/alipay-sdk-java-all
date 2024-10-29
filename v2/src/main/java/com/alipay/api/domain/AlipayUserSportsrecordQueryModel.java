package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运动记录查询
 *
 * @author auto create
 * @since 1.0, 2024-09-25 17:04:19
 */
public class AlipayUserSportsrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2388427961311692259L;

	/**
	 * 蚂蚁开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务编码
	 */
	@ApiField("out_biz_code")
	private String outBizCode;

	/**
	 * 页码，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每一页返回的，数据大小；最大不超过50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 流水日期
	 */
	@ApiField("record_date")
	private Date recordDate;

	/**
	 * 需要查询的运动类型
walk 步行
ride 骑行
run 跑步
	 */
	@ApiListField("sport_types")
	@ApiField("string")
	private List<String> sportTypes;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}
	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public List<String> getSportTypes() {
		return this.sportTypes;
	}
	public void setSportTypes(List<String> sportTypes) {
		this.sportTypes = sportTypes;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
