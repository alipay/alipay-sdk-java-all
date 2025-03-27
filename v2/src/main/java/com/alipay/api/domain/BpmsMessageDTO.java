package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * bpms消息体
 *
 * @author auto create
 * @since 1.0, 2024-06-25 14:22:28
 */
public class BpmsMessageDTO extends AlipayObject {

	private static final long serialVersionUID = 6461427765315591873L;

	/**
	 * bpms消息体
	 */
	@ApiField("alipmc_metaq_message_open_mq_dto")
	private AlipmcMetaqMessageOpenMqDTO alipmcMetaqMessageOpenMqDto;

	/**
	 * bpms流程实例
	 */
	@ApiField("alipmc_process_instance_open_mq_dto")
	private AlipmcProcessInstanceOpenMqDTO alipmcProcessInstanceOpenMqDto;

	/**
	 * 平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * bpms流程变量
	 */
	@ApiListField("variables_of_process_instance_open_mq_dto_list")
	@ApiField("variables_of_process_instance_open_mq_d_t_o")
	private List<VariablesOfProcessInstanceOpenMqDTO> variablesOfProcessInstanceOpenMqDtoList;

	public AlipmcMetaqMessageOpenMqDTO getAlipmcMetaqMessageOpenMqDto() {
		return this.alipmcMetaqMessageOpenMqDto;
	}
	public void setAlipmcMetaqMessageOpenMqDto(AlipmcMetaqMessageOpenMqDTO alipmcMetaqMessageOpenMqDto) {
		this.alipmcMetaqMessageOpenMqDto = alipmcMetaqMessageOpenMqDto;
	}

	public AlipmcProcessInstanceOpenMqDTO getAlipmcProcessInstanceOpenMqDto() {
		return this.alipmcProcessInstanceOpenMqDto;
	}
	public void setAlipmcProcessInstanceOpenMqDto(AlipmcProcessInstanceOpenMqDTO alipmcProcessInstanceOpenMqDto) {
		this.alipmcProcessInstanceOpenMqDto = alipmcProcessInstanceOpenMqDto;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public List<VariablesOfProcessInstanceOpenMqDTO> getVariablesOfProcessInstanceOpenMqDtoList() {
		return this.variablesOfProcessInstanceOpenMqDtoList;
	}
	public void setVariablesOfProcessInstanceOpenMqDtoList(List<VariablesOfProcessInstanceOpenMqDTO> variablesOfProcessInstanceOpenMqDtoList) {
		this.variablesOfProcessInstanceOpenMqDtoList = variablesOfProcessInstanceOpenMqDtoList;
	}

}
