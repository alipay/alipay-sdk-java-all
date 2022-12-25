package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 挡板集信息
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:47
 */
public class EcoMockGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 4465655449585453918L;

	/**
	 * appId
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 挡板数
	 */
	@ApiField("mock_count")
	private Long mockCount;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 分组状态: INUSE/UNUSE
	 */
	@ApiField("status")
	private String status;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getMockCount() {
		return this.mockCount;
	}
	public void setMockCount(Long mockCount) {
		this.mockCount = mockCount;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
