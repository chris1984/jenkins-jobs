def pulpcore_version = '3.17'
def pulpcore_distros = ['el7', 'el8']
def packaging_branch = 'rpm/3.17'
def pipelines = [
    'pulpcore': [
        'centos7',
        'centos8-stream'
    ]
]
