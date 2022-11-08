package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataFile;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.creditlink.collect.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-28 20:41:45
 */
public class ZhimaCreditEpCreditlinkCollectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7142339297169967662L;

	/** 
	 * 非文件模式下的数据返回结果。如果data_status为END，则该字段为空
	 */
	@ApiField("data_content")
	private String dataContent;

	/** 
	 * INIT表示任务还在初始化状态，COLLECT表示任务在进行中，END表示任务处理完成，FAIL表示任务处理失败。
	 */
	@ApiField("data_status")
	private String dataStatus;

	/** 
	 * 请求数据类型。与传入值一致
	 */
	@ApiField("data_type")
	private String dataType;

	/** 
	 * 数据内容加密方式。通过改加密方式和随机密钥信封可解密数据内容
	 */
	@ApiField("encrypt_model")
	private String encryptModel;

	/** 
	 * 文件地址列表。
文件内容为加密内容，需要使用上面的secret进行解密。具体内容格式与data_type有关。
文件地址有一定有效期，请及时取回
	 */
	@ApiListField("file_list")
	@ApiField("string")
	private List<String> fileList;

	/** 
	 * 返回的数据文件数量
	 */
	@ApiField("file_num")
	private Long fileNum;

	/** 
	 * 数据返回结果，包含数据类型和对应的访问地址
	 */
	@ApiListField("files")
	@ApiField("data_file")
	private List<DataFile> files;

	/** 
	 * 商户单号。与传入值一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/** 
	 * 随机秘钥信封。可使用该密钥解密数据内容
	 */
	@ApiField("secret")
	private String secret;

	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}
	public String getDataContent( ) {
		return this.dataContent;
	}

	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}
	public String getDataStatus( ) {
		return this.dataStatus;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDataType( ) {
		return this.dataType;
	}

	public void setEncryptModel(String encryptModel) {
		this.encryptModel = encryptModel;
	}
	public String getEncryptModel( ) {
		return this.encryptModel;
	}

	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
	public List<String> getFileList( ) {
		return this.fileList;
	}

	public void setFileNum(Long fileNum) {
		this.fileNum = fileNum;
	}
	public Long getFileNum( ) {
		return this.fileNum;
	}

	public void setFiles(List<DataFile> files) {
		this.files = files;
	}
	public List<DataFile> getFiles( ) {
		return this.files;
	}

	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}
	public String getMerchantRequestId( ) {
		return this.merchantRequestId;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getSecret( ) {
		return this.secret;
	}

}
