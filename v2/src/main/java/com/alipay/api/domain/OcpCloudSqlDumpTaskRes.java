package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * dump结果详情
 *
 * @author auto create
 * @since 1.0, 2024-08-28 16:16:38
 */
public class OcpCloudSqlDumpTaskRes extends AlipayObject {

	private static final long serialVersionUID = 7684782375711716543L;

	/**
	 * 实例arn
	 */
	@ApiField("cloud_instance_arn")
	private String cloudInstanceArn;

	/**
	 * [
                    {
                        "databaseName": "aaaliwei001",
                        "tableNameList": [
                            "atest001",
                            "data08",
                            "order"
                        ]
                    }
                ]
	 */
	@ApiListField("database_table_info")
	@ApiField("database_table")
	private List<DatabaseTable> databaseTableInfo;

	/**
	 * 任务备注
	 */
	@ApiField("description")
	private String description;

	/**
	 * oss下载链接
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 过期时间戳
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 文件大小，单位Byte
	 */
	@ApiField("file_size")
	private Long fileSize;

	/**
	 * 任务id，随机字符串
	 */
	@ApiField("id")
	private String id;

	/**
	 * RUNNING、WAITING、FINISH
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getCloudInstanceArn() {
		return this.cloudInstanceArn;
	}
	public void setCloudInstanceArn(String cloudInstanceArn) {
		this.cloudInstanceArn = cloudInstanceArn;
	}

	public List<DatabaseTable> getDatabaseTableInfo() {
		return this.databaseTableInfo;
	}
	public void setDatabaseTableInfo(List<DatabaseTable> databaseTableInfo) {
		this.databaseTableInfo = databaseTableInfo;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public Long getFileSize() {
		return this.fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
