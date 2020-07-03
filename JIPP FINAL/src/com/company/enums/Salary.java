package com.company.enums;

    public enum Salary {
        blueCollarsRewards(2500.0)
        , whiteCollarRewards (5000.0)
        , menagementRewards(1000.0);

        private final double rewards;

        Salary(double rewards) {
            this.rewards = rewards;
        }

        public double getRewards() {
            return rewards;
        }
    }

