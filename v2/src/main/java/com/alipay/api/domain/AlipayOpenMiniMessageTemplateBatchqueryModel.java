package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 消息子板批量查询接口
 *
 * @author auto create
 * @since 1.0, 2023-02-20 10:15:55
 */
public class AlipayOpenMiniMessageTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5593473917277588978L;

	/**
	 * 消息类型，目前仅支持查询订阅消息，biz_type:sub_msg
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 分页页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，目前上限为10
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 子版状态
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
