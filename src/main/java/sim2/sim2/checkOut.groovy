package sim2.sim2

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this