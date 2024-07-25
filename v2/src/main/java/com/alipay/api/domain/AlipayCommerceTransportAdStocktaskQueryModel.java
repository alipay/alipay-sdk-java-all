package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存任务查询
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:19:59
 */
public class AlipayCommerceTransportAdStocktaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6858912288435252729L;

	/**
	 * 广告主id + 在接口调用时，需要对ad_user_id和task_id进行权限校验，只有任务的创建用户才可以查看请求信息
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 库存查询任务id + 根据库存查询任务id来获得任务执行的情况
	 */
	@ApiField("task_id")
	private Long taskId;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
