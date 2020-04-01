package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 部署单查询接口
 *
 * @author auto create
 * @since 1.0, 2018-01-22 10:51:01
 */
public class AlipayDataDataserviceDeployorderDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2355947653695657677L;

	/**
	 * 描述：拉取的业务起始时间（不包含）
应用场景：管控中心启动后通过该参数获取增量发布的部署单
如何获取：获取本地部署单的最大时间
	 */
	@ApiField("biz_create_begin")
	private Date bizCreateBegin;

	/**
	 * 管控中心实例名称+唯一+通过该名称获取发布到该环境的部署单+无枚举值+通过页面配置自行定义
	 */
	@ApiField("biz_ins_name")
	private String bizInsName;

	/**
	 * 描述:页数，从1开始
应用场景:分页获取增量部署单
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 每页大小
	 */
	@ApiField("size")
	private Long size;

	public Date getBizCreateBegin() {
		return this.bizCreateBegin;
	}
	public void setBizCreateBegin(Date bizCreateBegin) {
		this.bizCreateBegin = bizCreateBegin;
	}

	public String getBizInsName() {
		return this.bizInsName;
	}
	public void setBizInsName(String bizInsName) {
		this.bizInsName = bizInsName;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

}
