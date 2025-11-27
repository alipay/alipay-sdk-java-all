package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreateESignTaskFileVO;
import com.alipay.api.domain.RecipientSignStatusResultVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antlescenter.docusignresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-02 16:35:14
 */
public class AlipayBossProdAntlescenterDocusignresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3362939944387977166L;

	/** 
	 * 业务方申请单号
	 */
	@ApiField("application_id")
	private String applicationId;

	/** 
	 * 申请方系统标识，即来源系统
	 */
	@ApiField("application_system")
	private String applicationSystem;

	/** 
	 * 业务线编码
	 */
	@ApiField("business_line_code")
	private String businessLineCode;

	/** 
	 * ds证书合并签约文件
	 */
	@ApiField("combined_file_vo")
	private CreateESignTaskFileVO combinedFileVo;

	/** 
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/** 
	 * 签约文件证书
	 */
	@ApiField("create_e_sign_task_file_vo")
	private CreateESignTaskFileVO createESignTaskFileVo;

	/** 
	 * 若失败，返回失败原因
	 */
	@ApiField("fail_info")
	private String failInfo;

	/** 
	 * 业务场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/** 
	 * 签约文件列表
	 */
	@ApiListField("sign_file_list")
	@ApiField("create_e_sign_task_file_v_o")
	private List<CreateESignTaskFileVO> signFileList;

	/** 
	 * 签署任务流水id，内部生成
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/** 
	 * 签字人状态
	 */
	@ApiListField("signer_dto")
	@ApiField("recipient_sign_status_result_vo")
	private List<RecipientSignStatusResultVo> signerDto;

	/** 
	 * 任务处理状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 租户
	 */
	@ApiField("tenant")
	private String tenant;

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationId( ) {
		return this.applicationId;
	}

	public void setApplicationSystem(String applicationSystem) {
		this.applicationSystem = applicationSystem;
	}
	public String getApplicationSystem( ) {
		return this.applicationSystem;
	}

	public void setBusinessLineCode(String businessLineCode) {
		this.businessLineCode = businessLineCode;
	}
	public String getBusinessLineCode( ) {
		return this.businessLineCode;
	}

	public void setCombinedFileVo(CreateESignTaskFileVO combinedFileVo) {
		this.combinedFileVo = combinedFileVo;
	}
	public CreateESignTaskFileVO getCombinedFileVo( ) {
		return this.combinedFileVo;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getContractId( ) {
		return this.contractId;
	}

	public void setCreateESignTaskFileVo(CreateESignTaskFileVO createESignTaskFileVo) {
		this.createESignTaskFileVo = createESignTaskFileVo;
	}
	public CreateESignTaskFileVO getCreateESignTaskFileVo( ) {
		return this.createESignTaskFileVo;
	}

	public void setFailInfo(String failInfo) {
		this.failInfo = failInfo;
	}
	public String getFailInfo( ) {
		return this.failInfo;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode( ) {
		return this.sceneCode;
	}

	public void setSignFileList(List<CreateESignTaskFileVO> signFileList) {
		this.signFileList = signFileList;
	}
	public List<CreateESignTaskFileVO> getSignFileList( ) {
		return this.signFileList;
	}

	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}
	public String getSignTaskId( ) {
		return this.signTaskId;
	}

	public void setSignerDto(List<RecipientSignStatusResultVo> signerDto) {
		this.signerDto = signerDto;
	}
	public List<RecipientSignStatusResultVo> getSignerDto( ) {
		return this.signerDto;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getTenant( ) {
		return this.tenant;
	}

}
