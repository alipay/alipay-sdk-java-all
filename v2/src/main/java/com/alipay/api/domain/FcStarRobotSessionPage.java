package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服聊天机器人分页对象
 *
 * @author auto create
 * @since 1.0, 2025-02-24 21:54:06
 */
public class FcStarRobotSessionPage extends AlipayObject {

	private static final long serialVersionUID = 4493316936237761255L;

	/**
	 * 总记录条数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 当前页码
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页显示记录条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 会话列表
	 */
	@ApiListField("result_obj")
	@ApiField("fc_star_robot_session")
	private List<FcStarRobotSession> resultObj;

	/**
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<FcStarRobotSession> getResultObj() {
		return this.resultObj;
	}
	public void setResultObj(List<FcStarRobotSession> resultObj) {
		this.resultObj = resultObj;
	}

	public Long getTotalPages() {
		return this.totalPages;
	}
	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

}
