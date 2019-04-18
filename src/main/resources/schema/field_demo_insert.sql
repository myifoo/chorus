INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
  VALUES ('chorus.IP', 'ipv4', '', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.IP', 'ipv6', '', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.IP', 'netmask', '子网掩码', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.IP', 'gateway', '网关', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.Account', 'username', '用户名', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.Account', 'password', '密码', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.Address', 'type', '地址类型', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.Address', 'type', '地址类型', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.host.HostAddress', 'ip', '', 'chorus.IP', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.host.ServerAddress', 'port', '', 'integer', '', '[0,65535]', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.host.URLAddress', 'context', '', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.host.URLAddress', 'url', '', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.AccessParameter', 'type', '参数类型', 'string', '', '', '', '', false, true, false , 'collector', 0, '');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'port', 'SNMP端口', 'integer', '', '[0,65535]', '161', '', false, true, false , 'collector', 0, '被管资源提供的snmp协议端口（UDP）');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'timeout', 'SNMP超时', 'integer', '毫秒', '', '', '', false, true, false , 'collector', 0, '通过SNMP协议访问被管资源时，系统等待被管资源返回的时间');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'retries', '重试次数', 'integer', '', '[1,10]', '2', '', false, true, false , 'collector', 0, '系统在等待时间内没有获得被管资源的回应时，再重新尝试的次数');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'Version_Get', 'Snmp版本（GET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '从被管资源读取数据时的Snmp版本');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'Community_Get', '共同体名（GET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV1、SNMPV2C从被管资源读取数据时使用的共同体名称');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'SecurityName_Get', 'SNMPV3用户（GET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3从被管资源读取数据时使用的用户安全名');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'AuthPassword_Get', 'SNMPV3验证密码（GET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3从被管资源读取数据时使用的用户验证密码');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'PrivPassword_Get', 'SNMPV3加密密码（GET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3从被管资源读取数据时使用的用户加密密码');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'Version_Set', 'Snmp版本（SET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '向被管资源设置数据时的Snmp版本');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'Community_Set', '共同体名（SET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV1、SNMPV2C向被管资源设置数据时使用的共同体名称');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'SecurityName_Set', 'SNMPV3用户（SET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3向被管资源设置数据时使用的用户安全名');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'AuthPassword_Set', 'SNMPV3验证密码（SET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3向被管资源设置数据时使用的用户验证密码');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)
VALUES ('chorus.SNMPParameter', 'PrivPassword_Set', 'SNMPV3加密密码（SET）', 'string', '', '', '', '', false, true, false , 'collector', 0, '通过SNMPV3向被管资源设置数据时使用的用户加密密码');
INSERT INTO public.field_model(owner, name, label, class, unit, range, default, format, optional, configurable, collectible, collector, interval, description)

26	chorus	ICMPParameter	TTL	TTL	integer		[1,255]	255				FALSE			Ping测试使用的TTL参数（生存时间）
27	chorus	ICMPParameter	Timeout	超时时间	integer	毫秒	[100,10000]	1000				FALSE			等待每次回复的超时时间(毫秒)
28	chorus	ICMPParameter	PacketSize	发送包长	integer	字节		32				FALSE			Ping测试的发送缓冲区大小
29	chorus	ICMPParameter	PacketNumber	发送包数	integer		[1,100]	4				FALSE			Ping测试要发送的回显请求数
30	chorus	TelnetParameter	address		chorus.ServerAddress			ServerAddress[port]=23				FALSE
31	chorus	TelnetParameter	account		chorus.Account							FALSE
32	chorus	WMIParameter	account		chorus.Account							FALSE
33	chorus	SNMPRWTest	SNMPStatus	SNMP测试状态	string							FALSE			目标地址进行SNMP读写访问测试的结果
34	chorus	SNMPRWTest	SNMPReadRTT	SNMP读测试响应时间	integer	毫秒						FALSE			目标地址进行SNMP读访问测试的响应时间
35	chorus	SNMPRWTest	SNMPWriteRTT	SNMP写测试响应时间	integer	毫秒						FALSE			目标地址进行SNMP读访问测试的响应时间
36	chorus.host	Host	name		string							FALSE
37	chorus.host	Host	type		string				FALSE			FALSE
38	chorus.host	Host	osType		string							FALSE
39	chorus.host	Host	osVersion		string							FALSE
40	chorus.host	Host	address		chorus.host.HostAddress							FALSE
41	chorus.host	LinuxServer	HardwareParameter		chorus.host.HardwareParameter							FALSE
42	chorus.host	LinuxServer	LinuxSSHParameter		chorus.host.LinuxSSHParameter							FALSE
43	chorus.host	LinuxServer	SNMPParameter		chorus.SNMPParameter							FALSE
44	chorus.host	LinuxServer	LinuxAgentParameter		chorus.host.LinuxServer.LinuxAgentParameter							FALSE
45	chorus.host	LinuxServer	SNMPRWTest		chorus.host.LinuxServer.SNMPRWTest							TRUE	getSNMPRWTest	300
46	chorus.host	LinuxServer	OSEcho		chorus.host.LinuxServer.OSEcho							TRUE	getOSEcho	0
47	chorus.host	LinuxServer	OSCPU		chorus.host.LinuxServer.OSCPU							TRUE	getOSCPU	300
48	chorus.host	LinuxServer	OSMEM		chorus.host.LinuxServer.OSMEM							TRUE	getOSMEM	300
49	chorus.host	LinuxServer	OSSwapInfo		chorus.host.LinuxServer.OSSwapInfo							TRUE	getOSSwapInfo	300
50	chorus.host	LinuxServer	OSBaseInfo		chorus.host.LinuxServer.OSBaseInfo							TRUE	getOSBaseInfo	300
51	chorus.host	LinuxServer	OSUptime		chorus.host.LinuxServer.OSUptime							TRUE	getOSUptime	300
52	chorus.host	LinuxServer	OSFileSystem		chorus.host.LinuxServer.OSFileSystem							TRUE	getOSFileSystem	300
53	chorus.host	LinuxServer	NetStat		chorus.host.LinuxServer.NetStat							TRUE	getNetStat	300
54	chorus.host	LinuxServer	NetStatSpeed		chorus.host.LinuxServer.NetStatSpeed							TRUE	getNetStatSpeed	300
55	chorus.host	LinuxServer	OSProcess		chorus.host.LinuxServer.OSProcess							TRUE	getOSProcess	300
56	chorus.host	LinuxServer	CPUInfo		host.LinuxServerCPUInfo
57	chorus.host.LinuxServer	CPUInfo	Type	CPU型号	string
58	chorus.host.LinuxServer	CPUInfo	ClockSpeed	CPU主频	float	GHZ
59	chorus.host.LinuxServer	DeviceLoad	DeviceLoadOneMinute	1分钟性能负载总和	float
60	chorus.host.LinuxServer	DeviceLoad	DeviceLoadFiveMinute	5分钟性能负载总和	float
61	chorus.host.LinuxServer	DeviceLoad	DeviceLoadFifteenMinute	15分钟性能负载总和	float
62	chorus.host.LinuxServer	DeviceLoad	DeviceLoadOneMinuteAvg	1分钟性能负载均值	float
63	chorus.host.LinuxServer	DeviceLoad	DeviceLoadFiveMinuteAvg	5分钟性能负载均值	float
64	chorus.host.LinuxServer	DeviceLoad	DeviceLoadFifteenMinuteAvg	15分钟性能负载均值	float
65	chorus.host.LinuxServer	Directory	DirectoryName	目录名	string
66	chorus.host.LinuxServer	Directory	DirectorySize	目录大小	long	byte
67	chorus.host.LinuxServer	DiskCountInfo	OnLineDiskCount	在线硬盘数量	integer
68	chorus.host.LinuxServer	DiskCountInfo	ExceptionDiskCount	异常硬盘数量	integer
69	chorus.host.LinuxServer	DiskInfo	DiskCapacity	硬盘容量	float	GB
70	chorus.host.LinuxServer	DiskInfo	DiskCount	硬盘数量	integer
71	chorus.host.LinuxServer	DiskStatisticInfo	DeviceID	设备ID	integer
72	chorus.host.LinuxServer	DiskStatisticInfo	SlotNumber	槽位号	integer
73	chorus.host.LinuxServer	DiskStatisticInfo	State	硬盘状态	integer
74	chorus.host.LinuxServer	DiskStatisticInfo	Index	索引	integer
75	chorus.host.LinuxServer	FileInfo	FileName	文件名	string
76	chorus.host.LinuxServer	FileInfo	FileSize	文件大小	int	byte
77	chorus.host.LinuxServer	FileInfo	FileTime	最后修改时间	long
78	chorus.host.LinuxServer	FileInfo	IsModify	最近5分钟是否更改	boolean
79	chorus.host.LinuxServer	FileInfo	FileCount	文件数	integer
80	chorus.host.LinuxServer	FluxStatistic	InOctets	总入流量	float	KB/s
81	chorus.host.LinuxServer	FluxStatistic	OutOctets	总出流量	float	KB/s
82	chorus.host.LinuxServer	FluxStatistic	Octets	总流量	float	KB/s
83	chorus.host.LinuxServer	InstallSoftware	Name	软件名称	string
84	chorus.host.LinuxServer	InstallSoftware	Signature	安装时间	long	s
85	chorus.host.LinuxServer	LinuxAgentParameter	Port	Agent端口	integer		[0,65535]	9001		FALSE					被管资源提供的Agent代理端口（TCP），一般为9001
86	chorus.host.LinuxServer	LinuxAgentParameter	Timeout	Agent连接超时	integer	毫秒	[100,30000]	5000		FALSE					通过代理访问被管资源时，系统等待被管资源返回的时间
87	chorus.host.LinuxServer	LinuxAgentParameter	Retries	重试次数	integer		[1,10]	3		FALSE					系统在等待时间内没有获得被管资源的回应时，再重新尝试的次数
88	chorus.host.LinuxServer	LinuxAgentParameter	SystemType	系统类型	enum		[redhat_linux,Novell_Suse,redflag_linux,centos,kylin]			FALSE					被管资源提供的系统类型
89	chorus.host.LinuxServer	LinuxSSHParameter	Port	SSH端口	integer
90	chorus.host.LinuxServer	LinuxSSHParameter	User	SSH连接用户名	string
91	chorus.host.LinuxServer	LinuxSSHParameter	PWD	SSH连接密码	string
92	chorus.host.LinuxServer	LinuxSSHParameter	Timeout	SSH超时	integer
93	chorus.host.LinuxServer	LinuxSSHParameter	Retries	重试次数	integer
94	chorus.host.LinuxServer	LinuxSSHParameter	SystemType	系统类型	string
95	chorus.host.LinuxServer	OSCPU	CPU_Load	负载(%)	integer	%
96	chorus.host.LinuxServer	OSCPU	CPU_Idle	空闲率(%)	integer	%
97	chorus.host.LinuxServer	OSCPU	SysLoad	系统占用百分比(%)	integer	%
98	chorus.host.LinuxServer	OSCPU	UserLoad	用户占用百分比(%)	integer	%
99	chorus.host.LinuxServer	OSCPU	Backups	不可被唤醒的进程数	integer
100	chorus.host.LinuxServer	OSCPU	Runs	等待运行中的进程数	integer
